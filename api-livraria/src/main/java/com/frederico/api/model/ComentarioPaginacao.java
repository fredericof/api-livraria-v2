package com.frederico.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComentarioPaginacao {
	
	private List<String> comentarios = new ArrayList<String>(
		    Arrays.asList("Livro muito bom.", "Muito bom.", "Excelente", "Este livro fala sobre tecnologia"));
	private Long offset = new Long(1);
	private Long limit = new Long(30);
	private Long total = new Long(76);
	private Long count = new Long(30);
	
	public ComentarioPaginacao(){}

	public List<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}

	public Long getOffset() {
		return offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}
