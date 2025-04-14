
package com.moontracker.agentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgentService {

    @Autowired
    private AgentRepository repository;

    public List<Agent> getAllAgents() {
        return repository.findAll();
    }

    public Agent findByCode(String code) {
        return repository.findByAgentCode(code);
    }

    public Agent createAgent(Agent agent) {
        agent.setCreatedAt(LocalDateTime.now());
        agent.setUpdatedAt(LocalDateTime.now());
        return repository.save(agent);
    }

    public Agent updateAgent(String id, Agent agent) {
        agent.setId(id);
        agent.setUpdatedAt(LocalDateTime.now());
        return repository.save(agent);
    }

    public void deleteAgent(String id) {
        repository.deleteById(id);
    }
}
