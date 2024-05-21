/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.service;

import java.util.List;

/**
 *
 * @author Sin Lian Feng
 */
public interface ProjectModuleService {
    
    /**
     * Get All Modules Details By Lecturer Id
     * @param lecturerId
     * @return List
     */
    public List getAllModuleDetailsByFirstMarkerId(Integer lecturerId);

    public List getAllModuleDetailsBySecondMarkerId(Integer lecturerId);
    
    public List getModuleDetailsByFirstMarkerId(Integer lecturerId);
    
    public List getModuleDetailsBySecondMarkerId(Integer lecturerId);
    
    //Jin Xun - Project Manager

    /**
     * 
     * @param ProjectManagerId
     * @return
     */
    public List getAllModuleDetailsByProjectManagerId(Integer ProjectManagerId);

    public List getModuleById(Integer moduleId);

    public Boolean saveModuleDetails(List moduleDetails);
}
