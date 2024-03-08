import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { JhipsterDemoSharedLibsModule, JhipsterDemoSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [JhipsterDemoSharedLibsModule, JhipsterDemoSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [JhipsterDemoSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterDemoSharedModule {
  static forRoot() {
    return {
      ngModule: JhipsterDemoSharedModule
    };
  }
}
