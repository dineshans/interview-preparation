package com.app.design.patterns.SolidPrinciple.LSP;

public class LSPTest {

    public static void main(String[] args) {

        WhatsAppMedia whatsAppMedia = new WhatsAppMedia();
        whatsAppMedia.groupVideoCall();
        whatsAppMedia.chatWithFriend();
        whatsAppMedia.sendPhotosAndVideos();

        InstagramMedia instagramMedia = new InstagramMedia();
        instagramMedia.chatWithFriend();
        instagramMedia.publishPost("Post");
        instagramMedia.sendPhotosAndVideos();


    }
}
