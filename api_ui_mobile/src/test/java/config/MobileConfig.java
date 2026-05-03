package config;

import org.aeonbits.owner.Config;

    @Config.Sources({
            "classpath:config/${env}.properties"
    })
    public interface MobileConfig extends Config {
        @Key("platformName")
        @DefaultValue("Android")
        String platformName();

        @Key("deviceName")
        @DefaultValue("Pixel_4")
        String deviceName();

        @Key("platformVersion")
        @DefaultValue("11.0")
        String platformVersion();

        @Key("appPath")
        @DefaultValue("src/test/resources/apps/app-release.apk")
        String appPath();

        @Key("isRemote")
        @DefaultValue("false")
        boolean isRemote();

        @Key("remoteUrl")
        @DefaultValue("http://185.154.53.106:4444/wd/hub")
        String remoteUrl();

    }

