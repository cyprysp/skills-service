package skills.services.events

import skills.storage.model.SkillDef

class CompletionTypeUtil {

    static CompletionItem.CompletionItemType getCompletionType(SkillDef.ContainerType type){
        switch (type) {
            case SkillDef.ContainerType.Subject:
                return CompletionItem.CompletionItemType.Subject
            case SkillDef.ContainerType.Badge:
                return CompletionItem.CompletionItemType.Badge
            default:
                throw new IllegalStateException("this method doesn't support type $type")
        }
    }
}