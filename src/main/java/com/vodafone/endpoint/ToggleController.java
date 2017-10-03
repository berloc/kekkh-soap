package com.vodafone.endpoint;

import com.vodafone.model.StatusResponse;
import com.vodafone.model.ToggleRequest;
import com.vodafone.model.ToggleResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ToggleController {

    @ResponseBody
    @PostMapping("/toggle")
    public ToggleResponse toggle(@RequestBody ToggleRequest request){
        ValidationEndpoint.isValid = request.getValid();
        return new ToggleResponse();
    }

    @ResponseBody
    @GetMapping("/current")
    public StatusResponse current(){
        return new StatusResponse(ValidationEndpoint.isValid);
    }

}
