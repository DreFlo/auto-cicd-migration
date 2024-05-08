@abstract
rule PipelineBlock
	match l : Left!CICD::PipelineBlock
	with r : Right!CICD::PipelineBlock {
	compare : true
}

rule Pipeline 
	match l : Left!CICD::Pipeline
	with r : Right!CICD::Pipeline
	extends PipelineBlock {
	compare : true
}

@greedy
rule Job
	match l : Left!CICD::Job
	with r : Right!CICD::Job
	extends PipelineBlock {
	compare : l.id == r.id
}

@greedy
rule Trigger 
	match l : Left!CICD::Trigger
	with r : Right!CICD::Trigger {
	compare : l.type() == r.type()
}

rule VariableDeclaration 
	match l : Left!VariableDeclaration
	with r : Right!VariableDeclaration {
	compare : l.eContainer().matches(r.eContainer()) and l.name = r.name
}

@greedy
rule Parameter 
	match l : Left!CICD::Parameter
	with r : Right!CICD::Parameter {
	compare : 
		l.eContainer().type() == CICD::Pipeline and
		r.eContainer().type() == CICD::Pipeline and
		l.id.name == r.id.name and 
		l.type() == r.type()
}
/*
post POST {
	for (m in matchTrace) { 
		m.println();
	}
}
*/
