package org.ec.mh.service.impl;

import org.ec.mh.dao.MHDaoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ImportAutoConfiguration({MHDaoConfiguration.class})
public class MHServiceImplConfiguration {
}
