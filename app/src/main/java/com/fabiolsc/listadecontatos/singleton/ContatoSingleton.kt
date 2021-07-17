package com.fabiolsc.listadecontatos.singleton

import com.fabiolsc.listadecontatos.feature.listacontatos.model.ContatosVO

object ContatoSingleton {
    var lista: MutableList<ContatosVO> = mutableListOf()
}