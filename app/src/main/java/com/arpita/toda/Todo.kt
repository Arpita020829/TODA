package com.arpita.toda

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

data class Tasks(val id:Int,val name:String,var Editing:Boolean=false)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun todo(){
    var mytask by remember { mutableStateOf(listOf<Tasks>()) }
    var showdialogue by remember { mutableStateOf(false) }



Column(modifier = Modifier.fillMaxSize().padding(8.dp),
    horizontalAlignment = Alignment.CenterHorizontally) { 
    Button(onClick = {showdialogue = true}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
     Text("Add Tasks")
    }
}
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
    items(mytask){

    }
    }
    if (showdialogue){
        AlertDialog(onDismissRequest = {showdialogue= false}){
            Text("Hello")
        }
    }

}

