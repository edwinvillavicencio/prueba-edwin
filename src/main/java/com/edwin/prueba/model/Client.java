package com.edwin.prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@Column(name = "client_id")
	private String clientId;
	
	@Column(name = "client_name")
	private String clientName;
	
	@Column(name = "document_type")
	private String documentType;
	
	@Column(name = "document_number")
	private String documentNumber;
	
	public Client() {
		
	}

	public Client(String clientId, String clientName, String documentType, String documentNumber) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", documentType=" + documentType
				+ ", documentNumber=" + documentNumber + "]";
	}

}
