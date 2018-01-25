package ch.hubobes.rider.specflow

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys

class ReversePackageSearchAction : AnAction() {
    override fun actionPerformed(ae: AnActionEvent) {

    }

    override fun update(e: AnActionEvent?) {
        val file = e!!.getData(CommonDataKeys.VIRTUAL_FILE)
        val visible = file != null && file.name.endsWith(".feature");
        e.presentation.isEnabledAndVisible = visible
    }
}