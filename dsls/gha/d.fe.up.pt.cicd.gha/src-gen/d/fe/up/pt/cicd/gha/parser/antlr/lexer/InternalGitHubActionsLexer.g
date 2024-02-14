/*
 * generated by Xtext 2.33.0
 */
lexer grammar InternalGitHubActionsLexer;

@header {
package d.fe.up.pt.cicd.gha.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Pull_request_review_comment : 'pull_request_review_comment';

Branch_protection_rule : 'branch_protection_rule';

Review_request_removed : 'review_request_removed';

Auto_merge_disabled : 'auto_merge_disabled';

Pull_request_review : 'pull_request_review';

Pull_request_target : 'pull_request_target';

Repository_dispatch : 'repository_dispatch';

Repository_projects : 'repository_projects';

Auto_merge_enabled : 'auto_merge_enabled';

CancelInProgress : 'cancel-in-progress';

Converted_to_draft : 'converted_to_draft';

ContinueOnError : 'continue-on-error';

Deployment_status : 'deployment_status';

Workflow_dispatch : 'workflow_dispatch';

WorkingDirectory : 'working-directory';

Ready_for_review : 'ready_for_review';

Registry_package : 'registry_package';

Review_requested : 'review_requested';

BranchesIgnore : 'branches-ignore';

Security_events : 'security_events';

TimeoutMinutes : 'timeout-minutes';

Project_column : 'project_column';

Pull_requests : 'pull_requests';

Workflow_call : 'workflow_call';

MaxParalell : 'max-paralell';

PathsIgnore : 'paths-ignore';

Project_card : 'project_card';

Pull_request : 'pull_request';

Workflow_run : 'workflow_run';

Check_suite : 'check_suite';

Concurrency : 'concurrency';

Credentials : 'credentials';

Deployments : 'deployments';

Description : 'description';

Discussions : 'discussions';

Environment : 'environment';

Merge_group : 'merge_group';

Permissions : 'permissions';

Synchronize : 'synchronize';

TagsIgnore : 'tags-ignore';

Deployment : 'deployment';

Discussion : 'discussion';

Entrypoint : 'entrypoint';

Page_build : 'page_build';

StartsWith : 'startsWith';

Unassigned : 'unassigned';

Cancelled : 'cancelled';

Check_run : 'check_run';

Container : 'container';

FailFast : 'fail-fast';

HashFiles : 'hashFiles';

Milestone : 'milestone';

Unlabeled : 'unlabeled';

Assigned : 'assigned';

Branches : 'branches';

Contains : 'contains';

Contents : 'contents';

Defaults : 'defaults';

EndsWith : 'endsWith';

FromJSON : 'fromJSON';

IdToken : 'id-token';

Includes : 'includes';

Packages : 'packages';

Password : 'password';

Reopened : 'reopened';

Required : 'required';

RunName : 'run-name';

Schedule : 'schedule';

Services : 'services';

Statuses : 'statuses';

Strategy : 'strategy';

Unlocked : 'unlocked';

Username : 'username';

Actions : 'actions';

Boolean : 'boolean';

Created : 'created';

Default : 'default';

Deleted : 'deleted';

Exludes : 'exludes';

Failure : 'failure';

Inherit : 'inherit';

Labeled : 'labeled';

Options : 'options';

Outputs : 'outputs';

Project : 'project';

Release : 'release';

RunsOn : 'runs-on';

Secrets : 'secrets';

Success : 'success';

Volumes : 'volumes';

Always : 'always';

Checks : 'checks';

Choice : 'choice';

Closed : 'closed';

Create : 'create';

Delete : 'delete';

Edited : 'edited';

Format : 'format';

Github : 'github';

Gollum : 'gollum';

Inputs : 'inputs';

Issues : 'issues';

Labels : 'labels';

Locked : 'locked';

Matrix : 'matrix';

Number : 'number';

Opened : 'opened';

Public : 'public';

Runner : 'runner';

Status : 'status';

String : 'string';

ToJSON : 'toJSON';

Group : 'group';

Image : 'image';

Label : 'label';

Needs : 'needs';

Pages : 'pages';

Paths : 'paths';

Ports : 'ports';

Shell : 'shell';

Steps : 'steps';

Types : 'types';

Value : 'value';

Watch : 'watch';

Write : 'write';

Args : 'args';

Cron : 'cron';

Fork : 'fork';

Jobs : 'jobs';

Join : 'join';

Name : 'name';

None : 'none';

Push : 'push';

Read : 'read';

Tags : 'tags';

Type : 'type';

Uses : 'uses';

Vars : 'vars';

With : 'with';

DollarSignLeftCurlyBracketLeftCurlyBracket : '${{';

Env : 'env';

Job : 'job';

Run : 'run';

Url : 'url';

ExclamationMarkEqualsSign : '!=';

AmpersandAmpersand : '&&';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

Id : 'id';

If : 'if';

On : 'on';

VerticalLineVerticalLine : '||';

RightCurlyBracketRightCurlyBracket : '}}';

ExclamationMark : '!';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Colon : ':';

LessThanSign : '<';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

RULE_DOUBLE : RULE_INT '.' RULE_INT;

RULE_BOOLEAN : ('true'|'false');

RULE_YAML_STRING : ('"' ('\\' .|~(('\\'|'"')))+ '"'|'\'' ('\\' .|~(('\\'|'\'')))+ '\''|. ( options {greedy=false;} : . )*('$'|RULE_NEWLINE)|'|' RULE_BEGIN . ( options {greedy=false;} : . )*'$' RULE_END);

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_NEWLINE : '\r'? '\n';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
