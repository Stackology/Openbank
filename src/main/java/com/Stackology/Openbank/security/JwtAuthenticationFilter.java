package main.java.com.Stackology.Openbank.security;

public class JwtAuthenticationFilter {
    // Implementação do filtro de autenticação JWT
    // Este é um exemplo básico, você pode precisar de bibliotecas como Spring Security para manipulação de autenticação

    private JwtTokenProvider jwtTokenProvider;

    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public void doFilter(String token) {
        if (jwtTokenProvider.validateToken(token)) {
            String username = jwtTokenProvider.getUsernameFromToken(token);
            // Lógica para autenticar o usuário com base no nome de usuário extraído do token
        } else {
            throw new BusinessException("Invalid JWT token", "401");
        }
    }
}
