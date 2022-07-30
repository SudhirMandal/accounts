package com.sudhir.accounts.repos;

import com.sudhir.accounts.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,Integer> {
}
