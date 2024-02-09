package DesignPattern.Factory.PracticalFactory.Flutter;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform platform){
        return  switch (platform){
            case ANDROID -> new AndroidUIfactory();
            case IOS -> new IOSUIFactory();
        };
    }
}
