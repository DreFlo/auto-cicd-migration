<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="cicdRefinement"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchReplaceStep():V"/>
		<constant value="A.__matchStep():V"/>
		<constant value="__exec__"/>
		<constant value="ReplaceStep"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyReplaceStep(NTransientLink;):V"/>
		<constant value="Step"/>
		<constant value="A.__applyStep(NTransientLink;):V"/>
		<constant value="String2StringLiteral"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="input"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="output"/>
		<constant value="StringLiteral"/>
		<constant value="CICD2"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:13-12:18"/>
		<constant value="12:4-12:18"/>
		<constant value="11:3-13:4"/>
		<constant value="__matchReplaceStep"/>
		<constant value="CICD1"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="J.refImmediateComposite():J"/>
		<constant value="id"/>
		<constant value=""/>
		<constant value="J.=(J):J"/>
		<constant value="steps"/>
		<constant value="J.indexOf(J):J"/>
		<constant value="J.and(J):J"/>
		<constant value="B.not():B"/>
		<constant value="42"/>
		<constant value="Command"/>
		<constant value="19:4-19:9"/>
		<constant value="19:4-19:33"/>
		<constant value="19:4-19:36"/>
		<constant value="19:39-19:41"/>
		<constant value="19:4-19:41"/>
		<constant value="20:4-20:9"/>
		<constant value="20:4-20:33"/>
		<constant value="20:4-20:39"/>
		<constant value="20:49-20:54"/>
		<constant value="20:4-20:55"/>
		<constant value="20:58-20:59"/>
		<constant value="20:4-20:59"/>
		<constant value="19:4-20:59"/>
		<constant value="23:3-26:5"/>
		<constant value="__applyReplaceStep"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="J.String2StringLiteral(J):J"/>
		<constant value="program"/>
		<constant value="25:16-25:26"/>
		<constant value="25:48-25:50"/>
		<constant value="25:16-25:51"/>
		<constant value="25:5-25:51"/>
		<constant value="link"/>
		<constant value="__matchStep"/>
		<constant value="J.not():J"/>
		<constant value="44"/>
		<constant value="32:9-32:14"/>
		<constant value="32:9-32:38"/>
		<constant value="32:9-32:41"/>
		<constant value="32:44-32:46"/>
		<constant value="32:9-32:46"/>
		<constant value="32:55-32:60"/>
		<constant value="32:55-32:84"/>
		<constant value="32:55-32:90"/>
		<constant value="32:100-32:105"/>
		<constant value="32:55-32:106"/>
		<constant value="32:51-32:106"/>
		<constant value="32:109-32:110"/>
		<constant value="32:51-32:110"/>
		<constant value="32:9-32:110"/>
		<constant value="32:4-32:111"/>
		<constant value="35:3-35:24"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="50"/>
			<dup/>
			<push arg="51"/>
			<load arg="19"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="53"/>
			<push arg="54"/>
			<push arg="55"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="56"/>
			<pushf/>
			<pcall arg="57"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<call arg="30"/>
			<set arg="34"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="58" begin="25" end="25"/>
			<lne id="59" begin="23" end="27"/>
			<lne id="60" begin="22" end="28"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="53" begin="18" end="29"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="51" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="61">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<call arg="65"/>
			<get arg="66"/>
			<push arg="67"/>
			<call arg="68"/>
			<load arg="19"/>
			<call arg="65"/>
			<get arg="69"/>
			<load arg="19"/>
			<call arg="70"/>
			<pushi arg="29"/>
			<call arg="68"/>
			<call arg="71"/>
			<call arg="72"/>
			<if arg="73"/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="50"/>
			<dup/>
			<push arg="51"/>
			<load arg="19"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="53"/>
			<push arg="74"/>
			<push arg="55"/>
			<new/>
			<pcall arg="56"/>
			<pusht/>
			<pcall arg="57"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="75" begin="7" end="7"/>
			<lne id="76" begin="7" end="8"/>
			<lne id="77" begin="7" end="9"/>
			<lne id="78" begin="10" end="10"/>
			<lne id="79" begin="7" end="11"/>
			<lne id="80" begin="12" end="12"/>
			<lne id="81" begin="12" end="13"/>
			<lne id="82" begin="12" end="14"/>
			<lne id="83" begin="15" end="15"/>
			<lne id="84" begin="12" end="16"/>
			<lne id="85" begin="17" end="17"/>
			<lne id="86" begin="12" end="18"/>
			<lne id="87" begin="7" end="19"/>
			<lne id="88" begin="34" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="51" begin="6" end="41"/>
			<lve slot="0" name="17" begin="0" end="42"/>
		</localvariabletable>
	</operation>
	<operation name="89">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="90"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="51"/>
			<call arg="91"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="53"/>
			<call arg="92"/>
			<store arg="93"/>
			<load arg="93"/>
			<dup/>
			<getasm/>
			<getasm/>
			<push arg="67"/>
			<call arg="94"/>
			<call arg="30"/>
			<set arg="95"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="96" begin="11" end="11"/>
			<lne id="97" begin="12" end="12"/>
			<lne id="98" begin="11" end="13"/>
			<lne id="99" begin="9" end="15"/>
			<lne id="88" begin="8" end="16"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="53" begin="7" end="16"/>
			<lve slot="2" name="51" begin="3" end="16"/>
			<lve slot="0" name="17" begin="0" end="16"/>
			<lve slot="1" name="100" begin="0" end="16"/>
		</localvariabletable>
	</operation>
	<operation name="101">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<call arg="65"/>
			<get arg="66"/>
			<push arg="67"/>
			<call arg="68"/>
			<load arg="19"/>
			<call arg="65"/>
			<get arg="69"/>
			<load arg="19"/>
			<call arg="70"/>
			<call arg="102"/>
			<pushi arg="29"/>
			<call arg="68"/>
			<call arg="71"/>
			<call arg="102"/>
			<call arg="72"/>
			<if arg="103"/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="50"/>
			<dup/>
			<push arg="51"/>
			<load arg="19"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="53"/>
			<push arg="46"/>
			<push arg="55"/>
			<new/>
			<pcall arg="56"/>
			<pusht/>
			<pcall arg="57"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="104" begin="7" end="7"/>
			<lne id="105" begin="7" end="8"/>
			<lne id="106" begin="7" end="9"/>
			<lne id="107" begin="10" end="10"/>
			<lne id="108" begin="7" end="11"/>
			<lne id="109" begin="12" end="12"/>
			<lne id="110" begin="12" end="13"/>
			<lne id="111" begin="12" end="14"/>
			<lne id="112" begin="15" end="15"/>
			<lne id="113" begin="12" end="16"/>
			<lne id="114" begin="12" end="17"/>
			<lne id="115" begin="18" end="18"/>
			<lne id="116" begin="12" end="19"/>
			<lne id="117" begin="7" end="20"/>
			<lne id="118" begin="7" end="21"/>
			<lne id="119" begin="36" end="41"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="51" begin="6" end="43"/>
			<lve slot="0" name="17" begin="0" end="44"/>
		</localvariabletable>
	</operation>
</asm>
