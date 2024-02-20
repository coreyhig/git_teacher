package com.example.nagoyameshi.form;

 import lombok.AllArgsConstructor;
import lombok.Data;
 
 @Data
 @AllArgsConstructor
public class ReservationRegisterForm {    
     public ReservationRegisterForm(Integer id, Integer id2, String string, Integer numberOfPeople2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private Integer StoreId;
         
     private Integer userId;    
         
     private String checkinDate; 
     
     private String checkinTime;
         
     private String checkoutDate;    
     
     private Integer numberOfPeople;
       
}
