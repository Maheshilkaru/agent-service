
package com.moontracker.agentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping
    public List<Agent> getAllAgents() {
        return agentService.getAllAgents();
    }

    @GetMapping("/search")
    public Agent searchByCode(@RequestParam String code) {
        return agentService.findByCode(code);
    }

    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {
        return agentService.createAgent(agent);
    }

    @PutMapping("/{id}")
    public Agent updateAgent(@PathVariable String id, @RequestBody Agent agent) {
        return agentService.updateAgent(id, agent);
    }

    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable String id) {
        agentService.deleteAgent(id);
    }
}
