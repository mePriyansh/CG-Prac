class PetrolPump {
int petrol;
int distance;
PetrolPump(int petrol, int distance) {
this.petrol = petrol;
4
this.distance = distance;
}
}
class CircularTour {
public int findStartingPoint(PetrolPump[] pumps) {
int start = 0, total = 0, tank = 0;
for (int i = 0; i < pumps.length; i++) {
tank += pumps[i].petrol - pumps[i].distance;
if (tank < 0) {
start = i + 1;
total += tank;
tank = 0;
}
}
return (tank + total) >= 0 ? start : -1;
}
}