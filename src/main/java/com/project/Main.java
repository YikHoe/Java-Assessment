/**
 * Function To Run The Program
 * @author CHAN HOONG JIAN
 * @version 1.0, Last edited on 2024-03-26
 * @since 2024-03-26
 */

package com.project;

import com.project.pojo.InvestigateReport;
import com.project.ui.authentication.LoginGui;
import lombok.extern.slf4j.Slf4j;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.util.FontPropertiesManager;

import javax.swing.*;

@Slf4j
public class Main {
    public static void main(String[] args) throws InterruptedException {
        start();
    }

    public static void start() {
        log.info("Project Management System Starting...");
        new LoginGui();
        log.info("Project Management System Ready.");
    }

}