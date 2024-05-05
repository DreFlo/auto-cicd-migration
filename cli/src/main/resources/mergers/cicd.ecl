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

@greedy
rule Step
	match l : Left!CICD::Step
	with r : Right!CICD::Step {
	compare : 
		l.eContainer().matches(r.eContainer()) and 
		l.eContainer().steps.indexOf(l) == r.eContainer().steps.indexOf(r) and
		l.type() == r.type()
}

rule VariableDeclaration 
	match l : Left!VariableDeclaration
	with r : Right!VariableDeclaration {
	compare : l.eContainer().matches(r.eContainer()) and l.name = r.name
}
/*
@abstract
rule Expression
	match l : Left!CICD::Expression
	with r : Right!CICD::Expression {
	compare : l.eContainer().matches(r.eContainer())
}

rule Concat 
	match l : Left!CICD::Concat
	with r : Right!CICD::Concat
	extends Expression {
	compare : 
		l.expressions.size() == r.expressions.size() and
		l.expressions
			.forAll(
				expression|
				r.expressions
					.at(
						l.expressions.indexOf(expression)
					)
					.matches(expression)
			);
}

rule StringLiteral
	match l : Left!CICD::StringLiteral
	with r : Right!CICD::StringLiteral
	extends Expression {
	compare : l.value == r.value
}

rule IntegerLiteral
	match l : Left!CICD::IntegerLiteral
	with r : Right!CICD::IntegerLiteral
	extends Expression {
	compare : l.value == r.value
}

rule DoubleLiteral
	match l : Left!CICD::DoubleLiteral
	with r : Right!CICD::DoubleLiteral
	extends Expression {
	compare : l.value == r.value
}

rule BooleanLiteral
	match l : Left!CICD::BooleanLiteral
	with r : Right!CICD::BooleanLiteral
	extends Expression {
	compare : l.value == r.value
}

rule VariableReference
	match l : Left!CICD::VariableReference
	with r : Right!CICD::VariableReference
	extends Expression {
	compare : l.reference.matches(r.reference)
}

@abstract
rule BinaryOp
	match l : Left!CICD::BinaryOp
	with r : Right!CICD::BinaryOp
	extends Expression {
	compare :
		l.lhs.matches(r.lhs) and
		r.rhs.matches(r.rhs)
}

rule EqualityOp
	match l : Left!CICD::EqualityOp
	with r : Right!CICD::EqualityOp
	extends BinaryOp {
	compare : l.op == r.op
}

rule ComparisonOp
	match l : Left!CICD::ComparisonOp
	with r : Right!CICD::ComparisonOp
	extends BinaryOp {
	compare : l.op == r.op
}

rule DotOp
	match l : Left!CICD::DotOp
	with r : Right!CICD::DotOp
	extends BinaryOp {
	compare : true
}

rule And
	match l : Left!CICD::And
	with r : Right!CICD::And
	extends BinaryOp {
	compare : true
}

rule Or
	match l : Left!CICD::Or
	with r : Right!CICD::Or
	extends BinaryOp {
	compare : true
}

@abstract
rule UnaryOp
	match l : Left!CICD::UnaryOp
	with r : Right!CICD::UnaryOp
	extends Expression {
	compare : r.rhs.matches(r.rhs)
}

rule Negation
	match l : Left!CICD::Negation
	with r : Right!CICD::Negation
	extends UnaryOp {
	compare : true
}
*/
/*
post POST {
	for (m in matchTrace) { 
		m.println();
	}
}
*/
