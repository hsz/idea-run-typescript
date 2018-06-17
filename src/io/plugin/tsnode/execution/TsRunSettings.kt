package io.plugin.tsnode.execution

import com.intellij.execution.configuration.EnvironmentVariablesData
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreterRef

data class TsRunSettings(
	var interpreterPath: NodeJsInterpreterRef = NodeJsInterpreterRef.createProjectRef(),
	var interpreterOptions: String = "",

	var workingDirectory: String = "",

	var envData: EnvironmentVariablesData = EnvironmentVariablesData.DEFAULT,

	var scriptName: String = "",
	var scriptOptions: String = "",

	var extraTypeScriptOptions: String = "",
	var typescriptConfigFile: String = ""
)
