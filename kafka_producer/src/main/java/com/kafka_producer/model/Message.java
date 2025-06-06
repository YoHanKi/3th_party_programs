package com.kafka_producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Message model representing the data structure that will be sent to Kafka.
 * This is a simple example, but in a real-world scenario, you might have more complex models.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    
    /**
     * Unique identifier for the message
     */
    private String id;
    
    /**
     * Content of the message
     */
    private String content;
    
    /**
     * Type of the message (e.g., INFO, WARNING, ERROR)
     */
    private String type;
    
    /**
     * Timestamp when the message was created
     */
    private LocalDateTime timestamp;
    
    /**
     * Source system that generated the message
     */
    private String source;
    
    /**
     * Additional metadata as key-value pairs
     */
    private java.util.Map<String, String> metadata;
}