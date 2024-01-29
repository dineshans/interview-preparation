package com.app.design.patterns.SolidPrinciple.LSP;

/*
* Since WhatsApp not support Public chat
* Instagram not support Group Video call
*
* So we have segregated the interface
* */
public interface SocialMedia {

    public void chatWithFriend();
    public void sendPhotosAndVideos();
}
