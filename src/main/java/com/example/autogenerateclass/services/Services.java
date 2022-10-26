package com.example.autogenerateclass.services;

import com.example.autogenerateclass.dtos.request.RegisterPathRequest;
import com.example.autogenerateclass.dtos.response.RegisterPathResponse;
import com.example.autogenerateclass.utils.CommonUtils;
import net.contentobjects.jnotify.JNotify;
import net.contentobjects.jnotify.JNotifyException;
import org.springframework.stereotype.Service;

@Service
public class Services {

    public RegisterPathResponse registerPath (RegisterPathRequest request){
//        boolean setPath = CommonUtils.setPath(request.getPathProject());
        boolean setPath = enableListenFile(request.getPathProject());
        if(setPath){
            return new RegisterPathResponse(false);
        }
        return new RegisterPathResponse(true);
    }

    public boolean enableListenFile(String pathProject)  {
        int mask = JNotify.FILE_CREATED  |
                JNotify.FILE_DELETED  |
                JNotify.FILE_MODIFIED |
                JNotify.FILE_RENAMED;
        boolean watchSubtree = true;
        try {
            JNotify.addWatch(pathProject, mask, watchSubtree, new ListenFile());
        } catch (Exception e){
            e.printStackTrace();
            return true;
        }
        return false;
    }
}
