使用nacos作为配置中心 如何区分开发、测试环境？
两种方式：
1.通过nacos命名空间来配置，如下：nacos新建命名空间，在bootstrap中配置spring.cloud.nacos.config.namespace

2.通过spring.application.name和spring.profiles.active来区分，以dev环境为例，在配置文件中配置spring.profiles.active为dev，在nacos的public命名空间中创建data-id为nacos-config-dev的配置数据即可