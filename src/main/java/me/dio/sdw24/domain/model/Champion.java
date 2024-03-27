package me.dio.sdw24.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {
    public String generateContextByQuestion(String question) {
        return """
        Pergunta: %s
        Nome do campeão: %s
        Role (Função): %s
        Lore (História): %s
        """.formatted(question, this.name, this.role, this.lore);
    }
}
