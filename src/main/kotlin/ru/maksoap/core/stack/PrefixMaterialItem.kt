package ru.maksoap.core.stack

data class PrefixMaterialItem(val prefix: Prefix, val material: Material) :
    Item(
        prefix.name + "." + material.name,
        prefix.prefix + material.localName + prefix.postfix
    ) {

}