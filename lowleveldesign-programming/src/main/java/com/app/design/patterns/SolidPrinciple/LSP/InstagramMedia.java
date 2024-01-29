package com.app.design.patterns.SolidPrinciple.LSP;

public class InstagramMedia implements  SocialMedia,SocialPostAndMediaManager{
    @Override
    public void chatWithFriend() {
        System.out.println("InstagramMedia - chatWithFriend");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("InstagramMedia - sendPhotosAndVideos");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("InstagramMedia - publishPost");
    }
}
