package com.sudhir.accounts.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "accounts")
@EntityListeners(AuditingEntityListener.class)
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accounts_id")
    private Integer accountId;
    @Column(name = "accounts_type")
    private String accountType;
    @Column(name = "accounts_branch")
    private String accountBranch;
    @Column(name = "accounts_created_at")
    @CreatedDate
    private LocalDateTime createdAt;
    @Column(name = "accounts_customer_id")
    private Integer customerId;

}
