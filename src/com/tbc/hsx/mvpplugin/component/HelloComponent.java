package com.tbc.hsx.mvpplugin.component;


import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;

import com.tbc.hsx.mvpplugin.action.MenuAction;
import org.jetbrains.annotations.NotNull;

public class HelloComponent implements ApplicationComponent {

    public HelloComponent() {
    }

    public void initComponent() {
        ActionManager am = ActionManager.getInstance();
        MenuAction menuAction = new MenuAction();

        am.registerAction("menuAction", menuAction);

        DefaultActionGroup windowsM = (DefaultActionGroup) am.getAction("WindowMenu");

        windowsM.addSeparator();
        windowsM.add(menuAction);
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "HelloComponent";
    }

}
