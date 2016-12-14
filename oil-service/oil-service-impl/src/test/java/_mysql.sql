/*Table structure for table `cms_article` */

DROP TABLE IF EXISTS `po_cms_article`;

CREATE TABLE `po_cms_article` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `category_id` varchar(64) NOT NULL COMMENT '栏目编号',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `image` varchar(255) DEFAULT NULL COMMENT '文章缩略图片',
  `keywords` varchar(255) DEFAULT NULL COMMENT '关键字',
  `description` varchar(255) DEFAULT NULL COMMENT '描述、摘要',
  `weight` int(11) DEFAULT '0' COMMENT '权重，越大越靠前',
  `hits` int(11) DEFAULT '0' COMMENT '点击数',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `cms_article_title` (`title`),
  KEY `cms_article_keywords` (`keywords`),
  KEY `cms_article_modify_time` (`modify_time`),
  KEY `cms_article_category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-文章表';


DROP TABLE IF EXISTS `po_cms_category`;
CREATE TABLE `po_cms_category` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `parent_id` varchar(32) NOT NULL COMMENT '父级编号',
  `office_id` varchar(64) DEFAULT NULL COMMENT '归属机构',
  `cat_type` varchar(20) DEFAULT NULL COMMENT '栏目类型',
  `name` varchar(100) NOT NULL COMMENT '栏目名称',
  `image` varchar(255) DEFAULT NULL COMMENT '栏目图片',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `keywords` varchar(255) DEFAULT NULL COMMENT '关键字',
  `sort` int(11) DEFAULT '30' COMMENT '排序（升序）',
  `in_menu` char(1) DEFAULT '1' COMMENT '是否在导航中显示',
  `is_show` char(1) DEFAULT '1' COMMENT '是否在分类页中显示列表',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `cms_category_parent_id` (`parent_id`),
  KEY `cms_category_module` (`cat_type`),
  KEY `cms_category_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-栏目表';

/*Table structure for table `cms_guestbook` */

DROP TABLE IF EXISTS `po_cms_guestbook`;
CREATE TABLE `po_cms_guestbook` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `content` varchar(255) NOT NULL COMMENT '留言内容',
  `image1` varchar(255) DEFAULT NULL COMMENT '上传图片1',
  `image2` varchar(255) DEFAULT NULL COMMENT '上传图片2',
  `image3` varchar(255) DEFAULT NULL COMMENT '上传图片3',
  `image4` varchar(255) DEFAULT NULL COMMENT '上传图片4',
  `name` varchar(100) NOT NULL COMMENT '姓名',
  `email` varchar(100) NOT NULL COMMENT '邮箱',
  `phone` varchar(100) NOT NULL COMMENT '电话',
  `workunit` varchar(100) NOT NULL COMMENT '单位',
  `ip` varchar(100) NOT NULL COMMENT 'IP',
  `create_time` datetime NOT NULL COMMENT '留言时间',
  `re_member_id` varchar(64) DEFAULT NULL COMMENT '回复人',
  `re_date` datetime DEFAULT NULL COMMENT '回复时间',
  `re_content` varchar(100) DEFAULT NULL COMMENT '回复内容',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-留言板';


DROP TABLE IF EXISTS `po_business_notice`;
CREATE TABLE `po_business_notice` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `category_id` varchar(32) NOT NULL COMMENT '栏目编号',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `is_show` char(1) DEFAULT '1' COMMENT '是否显示',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '运营管理-删除标记',
  PRIMARY KEY (`id`),
  KEY `cms_article_modify_time` (`modify_time`),
  KEY `cms_article_category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-资讯/公告';


DROP TABLE IF EXISTS `po_product_category`;
CREATE TABLE `po_product_category` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `parent_id` varchar(32) NOT NULL COMMENT '父级编号',
  `name` varchar(64) NOT NULL COMMENT '分类名称',
  `image` varchar(255) DEFAULT NULL COMMENT '图标',
  `is_show` char(1) DEFAULT '1' COMMENT '是否显示',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `description` varchar(255) DEFAULT NULL COMMENT '描述信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-商品分类';

DROP TABLE IF EXISTS `po_product`;
CREATE TABLE `po_product` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) NOT NULL COMMENT '商品名称',
  `category_id` varchar(64) NOT NULL COMMENT '分类id',
  `image` varchar(255) DEFAULT NULL COMMENT '缩略图',
  `introduction` longtext DEFAULT NULL COMMENT '商品简介',
  `keywords` varchar(255) DEFAULT NULL COMMENT '关键字',
  `weight` int(11) DEFAULT '0' COMMENT '权重，越大越靠前',
  `is_show` char(1) DEFAULT '1' COMMENT '是否显示',
  `month_hits` bigint(20) NOT NULL COMMENT '月点击数',
  `month_hits_date` datetime NOT NULL COMMENT '月点击数更新日期',
  `month_sales` bigint(20) NOT NULL COMMENT '月销量',
  `month_sales_date` datetime NOT NULL COMMENT '月销量更新日期',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `description` varchar(255) DEFAULT NULL COMMENT '描述信息',
  `attribute_value0` varchar(255) DEFAULT NULL COMMENT '',
  `attribute_value1` varchar(255) DEFAULT NULL COMMENT '',
  `attribute_value2` varchar(255) DEFAULT NULL COMMENT '',
  `attribute_value3` varchar(255) DEFAULT NULL COMMENT '',
  `attribute_value4` varchar(255) DEFAULT NULL COMMENT '',
  PRIMARY KEY (`id`),
  KEY `product_keywords` (`keywords`),
  KEY `product_category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-商品';

DROP TABLE IF EXISTS `po_product_parameter`;
CREATE TABLE `po_product_parameter` (
  `id` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) NOT NULL COMMENT '参数名称',
  `param_type` varchar(255) DEFAULT NULL COMMENT '参数类型',
  `weight` int(11) DEFAULT '0' COMMENT '权重，越大越靠前',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `description` varchar(255) DEFAULT NULL COMMENT '描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-商品参数';


DROP TABLE IF EXISTS `po_product_parameter_value`;
CREATE TABLE `po_product_parameter_value` (
  `product_id` varchar(32) NOT NULL COMMENT '商品ID',
  `parameter_id` varchar(32) NOT NULL COMMENT '参数ID',
  `parameter_value` varchar(255) DEFAULT NULL COMMENT '参数值',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-商品参数值';


DROP TABLE IF EXISTS `po_order`;
CREATE TABLE `po_order` (
  `id` varchar(32) NOT NULL COMMENT '订单id',
  `order_sn` varchar(20) NOT NULL COMMENT '订单编号',
  `member_id` varchar(20) NOT NULL COMMENT '会员编号',
  `product_id` varchar(20) NOT NULL COMMENT '商品编号',
  `order_type` char(1) DEFAULT '0' COMMENT '订单类型:0采购、1销售',
  `order_status` char(1) DEFAULT '0' COMMENT '订单状态:0待处理、1处理-确认、2处理-取消',
  `order_memo` varchar(255) DEFAULT null COMMENT '下单备注',
  `business_name` varchar(255) NOT NULL COMMENT '企业名称',
  `touch_name` varchar(64) NOT NULL COMMENT '联系人',
  `touch_phone` varchar(20) NOT NULL COMMENT '电话',
  `order_goods` decimal(20) NOT NULL COMMENT '订货量/吨',
  `bank` varchar(255) NOT NULL COMMENT '付款行',
  `bank_number` varchar(255) NOT NULL COMMENT '付款账号',
  `invoice` varchar(255) NOT NULL COMMENT '发票信息',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `description` varchar(255) DEFAULT NULL COMMENT '处理描述',
  PRIMARY KEY (`id`),
  KEY `po_order_member` (`member_id`),
  KEY `po_order_product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理-订单';

DROP TABLE IF EXISTS `pm_member_business`;
CREATE TABLE `pm_member_business` (
  `id` varchar(32) NOT NULL COMMENT '编码',
  `member_id` varchar(64) NOT NULL COMMENT '用户id',
  `business_name` varchar(255) NOT NULL COMMENT '企业名称',
  `business_info` varchar(255) DEFAULT NULL COMMENT '企业简介',
  `business_scope` varchar(255) DEFAULT NULL COMMENT '经营范围',
  `touch_name` varchar(20) NOT NULL COMMENT '企业联系人',
  `touch_phone` varchar(20) NOT NULL COMMENT '企业联系电话',
  `bank` varchar(255) NOT NULL COMMENT '付款行',
  `bank_number` varchar(255) NOT NULL COMMENT '付款账号',
  `invoice` varchar(255) NOT NULL COMMENT '发票信息',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `t_member_business_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户管理-公司信息';

DROP TABLE IF EXISTS `pm_member`;
CREATE TABLE `pm_member` (
  `id` varchar(32) NOT NULL COMMENT '主键，表唯一ID',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `nick` varchar(50) DEFAULT NULL COMMENT '昵称',
  `sex` varchar(20) DEFAULT 'MAN' COMMENT '性别:enum:man,男;women,女;none,未设置;',
  `avatar` varchar(200) DEFAULT NULL COMMENT '头像',
  `signature` varchar(200) DEFAULT NULL COMMENT '个性签名',
  `profile` varchar(2000) DEFAULT NULL COMMENT '个人简介',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `full_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `idCard` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `state` varchar(20) DEFAULT 'NORMAL' COMMENT '账号状态:enum:normal,正常;lock,锁定;destroy,注销;seal,封号;safety,安全问题;',
  `is_member` tinyint(1) DEFAULT '0' COMMENT '是否会员用户',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `last_ip` varchar(20) DEFAULT NULL COMMENT '最后登录IP',
  `last_device` varchar(20) DEFAULT NULL COMMENT '最后登录设备',
  `last_device_serial` varchar(200) DEFAULT NULL COMMENT '最后登录设备号',
  `last_serial_number` varchar(200) DEFAULT NULL COMMENT '最后序列号',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `wrong_times` int(11) DEFAULT NULL COMMENT '密码错误次数',
  `wrong_date` datetime DEFAULT NULL COMMENT '密码错误日期',
  `public_message` varchar(20) DEFAULT NULL COMMENT '公告接收状态  enum:open,开启;close,结束;',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=383411367 DEFAULT CHARSET=utf8 COMMENT='用户管理-用户';

DROP TABLE IF EXISTS `pm_member_third`;
CREATE TABLE `pm_member_third` (
  `id` varchar(32) NOT NULL COMMENT '主键，表唯一ID',
  `platform` varchar(20) DEFAULT NULL COMMENT '平台类型:enum:weixin,微信;qq,qq;xinlang,新浪;',
  `serial` varchar(200) DEFAULT NULL COMMENT '唯一编码',
  `name` varchar(50) DEFAULT NULL COMMENT '平台用户名',
  `is_relation` tinyint(1) DEFAULT NULL COMMENT '是否关联',
  `platform_name` varchar(50) DEFAULT NULL COMMENT '关联账户名称',
  `platform_avatar` varchar(200) DEFAULT NULL COMMENT '关联账户头像',
  `create_user` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_user` varchar(50) NOT NULL COMMENT '修改人',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `member_id` bigint(20) DEFAULT NULL COMMENT '注册用户ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户管理-三方账户关联';

DROP TABLE IF EXISTS `pm_member_wx`;
CREATE TABLE `pm_member_wx` (
  `id` varchar(32) NOT NULL COMMENT '主键，表唯一ID',
  `openid` varchar(100) NOT NULL COMMENT '微信标识',
  `member_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `is_subscription` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否授权',
  PRIMARY KEY (`id`),
  UNIQUE KEY `openid` (`openid`) USING BTREE,
  KEY `is_subscription` (`is_subscription`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='用户管理-绑定微信';

DROP TABLE IF EXISTS `po_sms_queue`;
CREATE TABLE `po_sms_queue` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `template_id` varchar(20) DEFAULT NULL COMMENT '短信模版ID',
  `type` varchar(20) DEFAULT NULL COMMENT '用户类型:enum:member,会员;system,系统;',
  `name` varchar(50) DEFAULT NULL COMMENT '用户姓名',
  `phone` varchar(20) NOT NULL COMMENT '手机号码',
  `content` varchar(200) NOT NULL COMMENT '消息内容',
  `send_times` int(11) DEFAULT NULL COMMENT '发送次数',
  `is_success` tinyint(1) DEFAULT NULL COMMENT '是否成功',
  `success_time` datetime DEFAULT NULL COMMENT '发送成功时间',
  `last_send_time` datetime DEFAULT NULL COMMENT '最后发送时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=230 DEFAULT CHARSET=utf8 COMMENT='运营管理-短信队列';

DROP TABLE IF EXISTS `po_sms_template`;
CREATE TABLE `po_sms_template` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(20) DEFAULT NULL COMMENT '模板名称:enum:register,注册验证码;pwdmodify,密码修改;notice,通知;active,活动;',
  `content` varchar(200) NOT NULL COMMENT '消息内容',
  `is_enable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否启用',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=230 DEFAULT CHARSET=utf8 COMMENT='运营管理-短信模板';

