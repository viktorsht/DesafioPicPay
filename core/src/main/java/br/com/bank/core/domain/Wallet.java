package br.com.bank.core.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Wallet {
    private Long id;
    private BigDecimal balance;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Wallet(Long id, BigDecimal balance, User user, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.balance = balance;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Wallet(){}

    public Wallet(BigDecimal balance, User user, LocalDateTime createdAt) {
        this.balance = balance;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }
}
