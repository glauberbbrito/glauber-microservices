package com.glauber.foo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Greeting implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String content;	
	
}
