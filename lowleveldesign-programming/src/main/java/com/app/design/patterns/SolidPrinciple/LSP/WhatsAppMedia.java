package com.app.design.patterns.SolidPrinciple.LSP;

public class WhatsAppMedia implements SocialMedia,VideoCallManager {
    @Override
    public void chatWithFriend() {
        System.out.println("WhatsAppMedia - chatWithFriend");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("WhatsAppMedia - sendPhotosAndVideos");
    }

    @Override
    public void groupVideoCall(String... users) {
        System.out.println("WhatsAppMedia - groupVideoCall");
    }
}
