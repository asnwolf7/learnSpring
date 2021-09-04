package com.smart.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping("/upload.html")
    public String uploadPage(){
        return "uploadForm";
    }

    @RequestMapping(value = "upload.action", method= RequestMethod.POST)
    @ResponseBody
    public String uploadFile(HttpServletRequest request, @RequestParam("description") String description, @RequestParam("file") MultipartFile file) throws IOException {

        System.out.println(description);
        if(!file.isEmpty()){
            String path = request.getRealPath("/upload/");
            String fileName = file.getOriginalFilename();
            File filePath = new File(path, fileName);

            if(!filePath.getParentFile().exists()){
                filePath.getParentFile().mkdirs();
            }
            file.transferTo(new File(path + File.separator+ fileName));
            return "Your successfully uploaded file=" + fileName;
        }
        return "You failed to upload " + file.getOriginalFilename() + " because the file is empty";
    }
}
