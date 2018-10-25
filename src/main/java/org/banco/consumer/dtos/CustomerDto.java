package org.banco.consumer.dtos;

import java.util.Date;

public class CustomerDto {

		private long id;
		private String name;
		private Date lastSignedOn;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getLastSignedOn() {
			return lastSignedOn;
		}
		public void setLastSignedOn(Date lastSignedOn) {
			this.lastSignedOn = lastSignedOn;
		}
		
		
		
}
