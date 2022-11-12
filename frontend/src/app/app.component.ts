import { Component } from '@angular/core';
import {AlticciService} from "./services/alticci";
import {Alticci} from "./models/alticci";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  result: any;
  position: number | undefined;

  alticci: Alticci = {} as Alticci;

  constructor(private alticciService: AlticciService) {}


  onSubmit() {
    this.getAlticciValue()
  }

   getAlticciValue = () => {
    this.alticciService.getAlticciValue(<number>this.position)
      .subscribe(alticci => {
        this.alticci = alticci
      });
    }



}
