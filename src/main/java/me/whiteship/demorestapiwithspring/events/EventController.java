package me.whiteship.demorestapiwithspring.events;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.methodOn;

@Controller
public class EventController {

    @PostMapping("api/events")
    public ResponseEntity createEvent(){
        URI createdUri = linkTo(methodOn(EventController.class)).slash("{id}").toUri();
        return ResponseEntity.created(createdUri).build();
    }
}
