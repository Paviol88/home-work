package com.sbrf.reboot.service;

import lombok.Data;

@Data
public class Account {
   private String accnum;

   public Account(String accnum) {
      this.accnum = accnum;

   }
}
