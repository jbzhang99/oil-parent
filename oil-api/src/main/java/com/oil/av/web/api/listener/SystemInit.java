package com.oil.av.web.api.listener;


import org.apache.commons.dbutils.DbUtils;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.oil.av.web.api.constant.ErrCodeConfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 系统初始化信息
 */
public class SystemInit implements ServletContextListener {
    //static Logger logger = Logger.getLogger(SystemInit.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        logger.info("####################################################");
//        logger.info("############# Starting  init  System ###############");
//        logger.info("####################################################");
        try (Connection conn = getConnection()) {
            ErrCodeConfig.init(conn);
        } catch (SQLException e) {
 //           logger.error("读取数据库数据异常", e);
        } catch (IOException e) {
 //           logger.error("读取配置文件异常", e);
        }
 //       logger.info("############# Starting init Finished ###############");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        logger.info("####################################################");
//        logger.info("################ App was stopped ###################");
//        logger.info("####################################################");
    }
    
    /**
     * 获取数据库连接
     *
     * @return 数据库连接
     * @throws SQLException 数据库连接时发生异常
     * @throws IOException  读取配置文件时发生异常
     * @since 1.1
     */
    public static Connection getConnection() throws SQLException, IOException {
        // <editor-fold desc="读取配置文件">
        Properties properties = PropertiesLoaderUtils.loadAllProperties("properties/datasource.properties");
        DbUtils.loadDriver("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(properties.getProperty("jdbc.url"), properties.getProperty("jdbc.username"),
                properties.getProperty("jdbc.password"));
        // </editor-fold>
    }

    
}
