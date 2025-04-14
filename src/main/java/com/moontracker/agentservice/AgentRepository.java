
package com.moontracker.agentservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgentRepository extends MongoRepository<Agent, String> {
    Agent findByAgentCode(String agentCode);
}
