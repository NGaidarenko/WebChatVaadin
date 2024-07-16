package com.example.web_chat;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.server.AppShellSettings;

@Push
public class CustomClass implements AppShellConfigurator {
    @Override
    public void configurePage(AppShellSettings settings) {
        AppShellConfigurator.super.configurePage(settings);
    }
}
