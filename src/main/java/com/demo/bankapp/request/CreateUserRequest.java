package com.demo.bankapp.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@EqualsAndHashCode(callSuper = false)
@Setter @Getter
public class CreateUserRequest extends BaseRequest {

	private String username;
	private String password;

}
