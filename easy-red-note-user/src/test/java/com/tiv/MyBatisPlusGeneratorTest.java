package com.tiv;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyBatisPlusGeneratorTest {

    public static void main(String[] args) {

        /*
         * 1.全局配置
         */
        GlobalConfig config = new GlobalConfig();
        // 是否支持 AR 模式
        config.setActiveRecord(true)
                // 设置作者
                .setAuthor("tiv")
                // 设置生成路径,最好使用绝对路径
                .setOutputDir("src/main/java/")
                // 设置文件覆盖配置
                .setFileOverride(true)
                // 设置主键策略
                .setIdType(IdType.AUTO)
                .setDateType(DateType.ONLY_DATE)
                // 设置生成的service接口的名字的首字母是否为I,默认以I开头
                .setServiceName("%sService")
                // 设置实体类结尾名称DO
                .setEntityName("%sDO")
                // 设置生成基础的resultMap
                .setBaseResultMap(true)
                // 设置不使用AR模式
                .setActiveRecord(false)
                // 设置生成基础的SQL片段
                .setBaseColumnList(true);

        /*
         * 2.数据库配置
         */
        DataSourceConfig dsConfig = new DataSourceConfig();
        // 设置数据库类型
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3306/easy_red_note?useSSL=false&serverTimezone=Asia/Shanghai")
                .setUsername("root")
                .setPassword("root");

        /*
         * 3.策略配置
         */
        StrategyConfig stConfig = new StrategyConfig();
        // 全局大写命名
        stConfig.setCapitalMode(true)
                // 设置数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                // 设置使用lombok插件
                .setEntityLombokModel(true)
                // 设置使用restController注解
                .setRestControllerStyle(true)
                // 设置生成的表,支持多表一起生成,以数组形式填写
                .setInclude("user", "user_address");

        /*
         * 4.包名策略配置
         */
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.tiv")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("model")
                .setXml("mapper");

        /*
         * 5.整合配置
         */
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        /*
         * 6.执行操作
         */
        ag.execute();

        /*
         * 7.最后输出
         */
        System.out.println("测试代码自动生成完毕");
    }
}
