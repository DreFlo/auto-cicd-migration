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

@abstract
rule Job
	match l : Left!CICD::Job
	with r : Right!CICD::Job
	extends PipelineBlock {
	compare : l.id == r.id
}

rule ScriptJob
	match l : Left!CICD::ScriptJob
	with r : Right!CICD::ScriptJob
	extends Job {
	compare : true	
}

rule PipelineCallJob
	match l : Left!CICD::PipelineCallJob
	with r : Right!CICD::PipelineCallJob
	extends Job {
	compare : true
}
