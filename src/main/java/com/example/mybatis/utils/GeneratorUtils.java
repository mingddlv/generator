package com.example.mybatis.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @ClassName Generator
 * @Description TODO
 * @Author mac
 * @DATE 2022/5/11 10:42
 */
public class GeneratorUtils {
    public void init(String database){
        String url = "jdbc:mysql://localhost:3306/" + database;
        FastAutoGenerator.create(url, "root", "123456")
                .globalConfig(builder -> {
                    builder.author("mac") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\MAC\\mybatis\\src\\main\\java\\com\\example\\mybatis\\"+database); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(database) // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "D:\\MAC\\mybatis\\src\\main\\java\\com\\example\\mybatis\\"+database)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
