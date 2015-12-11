package de.rrze.cedit

class CeditController {

	static navigation = [
		'app': [
			visible: { true },
			order: 60,
			subentries: [
				main: [controller:'cedit', action:'index', order:100],
				template: [controller:'ceditTemplate', action:'manage', order:90],
				script: [controller:'ceditScript', action:'manage', order:80],
				dsl: [controller:'ceditDsl', action:'manage', order:70],
			]
		]
	]

    def index() {
    }
}
