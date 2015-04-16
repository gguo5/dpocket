/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpocket.util;

import java.io.File;
import java.net.URL;
import org.apache.log4j.Logger;

/**
 *
 * @author Grant
 */
public class Helper {
     final static Logger logger = Logger.getLogger(Helper.class.getName());
    public void getFileFromClassPath(){
        
    URL res = this.getClass().getClassLoader().getResource("log4j.properties");
        File f = new File(res.getFile());
        
        logger.info("res abs: "+f.getAbsolutePath());
        logger.info("res name:  "+f.getName());
    }
}
