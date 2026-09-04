import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ViewModel {
    private val _uiState = MutableStateFlow("Initial State")
    val uiState: StateFlow<String> = _uiState

    fun updateState(newValue: String) {
        _uiState.value = newValue
    }
}

fun main() {
    val vm = ViewModel()
    println("Current state: ${vm.uiState.value}")
    vm.updateState("Updated State")
    println("New state: ${vm.uiState.value}")
}
