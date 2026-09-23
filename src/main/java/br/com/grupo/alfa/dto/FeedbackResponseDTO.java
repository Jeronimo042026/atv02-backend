package br.com.grupo.alfa.dto;

import br.com.grupo.alfa.model.Feedback;

public record FeedbackResponseDTO(
    Long id,
    Integer rating,
    String comment
) {
    public static FeedbackResponseDTO fromEntity(Feedback feedback) {
        return new FeedbackResponseDTO(feedback.getId(), feedback.getRating(), feedback.getComment());
    }
}
