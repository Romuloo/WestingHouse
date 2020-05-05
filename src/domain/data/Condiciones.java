/**
 Copyright [2020] [Javier Linares Castrillón]
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package domain.data;

/**
 * @author Javier Linares Castrillón
 */
public enum Condiciones {

    A(0.06),
    B(0.04),
    C(0.02),
    D(0.00),
    E(-0.03),
    F(-0.07);

    private double puntuacion;

    Condiciones(double s){
        puntuacion = s;
    }

    public double getCondiciones(){
        return puntuacion;
    }

}
