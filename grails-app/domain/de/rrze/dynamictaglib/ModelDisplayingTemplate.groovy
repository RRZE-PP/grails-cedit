package de.rrze.dynamictaglib

class ModelDisplayingTemplate {
	String label
	String content

	ModelGeneratingScript defaultScript

	static constraints = {
		label blank: false, unique:true
		content blank:false, maxSize: 512000
		defaultScript nullable:true, unique:false
	}
}
